import io.qameta.allure.Attachment;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Tests extends TestsSteps {
    @Test(description = "Calculator Sum")
    @Attachment(value = "screenshot", type = "image/png")
    public void T1()
    {
        checkSumStep(1,2,3);
    }

    @Test(description = "Calculator Sub")
    public void T2()
    {
        checkSubStep(4,2,2);
    }

    @Test(description = "Calculator Mul")
    public void T3()
    {
        checkMulStep(4,2,8);
    }

    @Test(description = "Calculator Div")
    public void T4()
    {
        checkDivStep(6,3,2);
    }
}
