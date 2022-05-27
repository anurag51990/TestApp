public class SecurityImpl implements Security {
    private String spnName;

    public void SecurityImpl(){
        this.spnName = "";
    }

    @Override
    public String getSecurityName() {
        return this.spnName;
    }

    @Override
    public void setSecurityName(String name ) {
        this.spnName = name;
    }
}
