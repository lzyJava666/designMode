package composition;

/**
 * 人
 */
public class Person {
    //人和脸不可分离
    private Face face=new Face();
    //人和身份证可以分离
    private IdentityCard identityCard;

    public Face getFace() {
        return face;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }
}
