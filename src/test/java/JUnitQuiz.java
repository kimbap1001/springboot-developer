import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

public class JUnitQuiz {
    @Test
    public void junitTest(){
        String name1="홍길동";
        String name2="홍길동";
        String name3="홍길은";

        assertThat(name1).isNotEqualTo(null);
        assertThat(name2).isNotEqualTo(null);
        assertThat(name3).isNotEqualTo(null);

        assertThat(name1).isEqualTo(name2);
        assertThat(name1).isNotEqualTo(name3);


    }
}
