package cpp.listener;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect; 
@Aspect
public class AfterReturningAdivceTest {
    @AfterReturning( returning = "rvt" ,
            pointcut = "adviceExpression.test()")
    public void log(Object rvt)
    {
        System.out.println("获取目标方法返回值:"+rvt) ; 
        System.out.println("模拟记录日志功能...") ; 
    }
}