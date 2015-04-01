package cpp.listener;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class BeforeAdviceTest 
{
 
    @Before( "execution(* cpp.service.*EventServiceImplement*.*(..))")
    public void foo()
    {
        System.out.println("模拟执行权限检查") ;
    }
}