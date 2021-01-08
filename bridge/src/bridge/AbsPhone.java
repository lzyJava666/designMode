package bridge;

public abstract class AbsPhone {

    private IBrand iBrand;

    public AbsPhone(IBrand iBrand){
        super();
        this.iBrand=iBrand;
    }

    protected void start(){
        iBrand.start();
    }

    protected void close(){
        iBrand.close();
    }

    protected void call(){
        iBrand.call();
    }

}
