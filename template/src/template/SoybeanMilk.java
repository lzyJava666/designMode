package template;

/**
 * 抽象豆浆类
 */
public abstract class SoybeanMilk {
    //制作豆浆的方法
    public final void template(){
        select();
        if(isAdd())
        add();
        soak();
        smash();
    }

    //选择材料
    private void select(){
        System.out.println("选择一批好的黄豆");
    }

    //添加材料
    protected abstract void add();

    //浸泡
    private void soak(){
        System.out.println("材料正在浸泡");
    }

    //打碎
    private void smash(){
        System.out.println("打碎中...");
    }

    public boolean isAdd(){
        return true;
    }
}
