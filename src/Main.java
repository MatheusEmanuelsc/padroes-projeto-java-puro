import com.padroes.projeto.gof.facade.Facade;
import com.padroes.projeto.gof.singleton.SingletonLazy;
import com.padroes.projeto.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------Sigleton---------------------");
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);


        System.out.println("--------------------Strategy----------------------");
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        System.out.println("--------------------Facade----------------------");

        Facade facade = new Facade();
        facade.migrarCliente("Jao", "12345678");
    }
}