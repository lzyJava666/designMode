package abstractfactory;

/**
 * 衣服类
 */
public abstract class Clothes {
    //衣服名
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    //什么品种的衣服，由子类实现
    public abstract void type();
    //客户选衣服
    public void select(){
        System.out.println("客户从衣柜中选中："+name);
    }
    //店铺工作人员拿到衣服
    public void take(){
        System.out.println("工作人员拿到衣服："+name);
    }
    //客户买走了衣服
    public void buy(){
        System.out.println("客户买到了衣服："+name);
    }
}
