package deepcopy;

import java.io.Serializable;

/**
 * 深拷贝实例---脸
 */
public class Face implements Serializable,Cloneable {
    private String eye;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Face(String eye) {
        this.eye = eye;
    }

    @Override
    public String toString() {
        return "Face{" +
                "eye='" + eye + '\'' +
                '}';
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }
}
