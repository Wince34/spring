import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;

/*@RunWith(Suite.class)
@Suite.SuiteClasses({})*/
public class JunitTest {
    //测试 add()方法
    @Test
    public void testAdd(){
        int result = add(1, 2);
        assertEquals(result,3);
    }

    /**
     * 传入两个参数，求和
     * @param a
     * @param b
     * @return
     */
    public int add(int a,int b){
        return a+b;
    }
    /**
     * 传入两个参数，求差
     * @param a
     * @param b
     * @return
     */
    public int sub(int a,int b){
        return a-b;
    }
}
