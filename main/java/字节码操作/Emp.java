package 字节码操作;

public class Emp {


    private int empno;
    private String ename;




    public Emp() {
    }

    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }
}
