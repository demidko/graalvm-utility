import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class AppKtTest {

  @Test
  fun test() {
    assertThat("1".toInt()).isEqualTo(1)
  }
}