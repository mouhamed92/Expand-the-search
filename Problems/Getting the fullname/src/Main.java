class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
           this.firstName = firstName ;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName ;
    }

    public String getFullName() {
        if ( this.firstName==null || this.firstName.equals("")){
            return this.lastName ;
        }else if (this.lastName ==null || this.lastName.equals("")){
        return this.firstName ;}
        else if ((this.firstName==null ||  this.firstName.equals("")) && (this.lastName==null || this.lastName.equals(""))){
            return "Unknown";
        }else {
            return this.firstName+" "+this.lastName ;
        }
    }
}