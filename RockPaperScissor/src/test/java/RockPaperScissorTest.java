import com.app.model.Moves;
import com.app.service.RockPaperScissor;
import com.app.utils.CustomUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nahus on 07-03-2018.
 */
public class RockPaperScissorTest {
    @Test
    public void testRandomGeneratorFunc() {
        int i = 1;
        while (i < 10) {
            Moves selectedMove = CustomUtil.getRandomMoves();
            System.out.println(selectedMove.getMoveValue());
            Assert.assertTrue(selectedMove.getMoveValue() < 4 && selectedMove.getMoveValue() > 0);
            i++;
        }
    }

    @Test
    public void testRockPaperScissorAppTest() {
        new RockPaperScissor().intiateGame(Moves.PAPER, 100);
    }
}
