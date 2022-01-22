package com.megapinions.vipCustomer;

public class VipCustmer {


    private String name;
    private String email_address;
    private int credit;

    public VipCustmer() {
        this("Mr Stone", "aumar1665@gmail.com", 200);
    }

    public VipCustmer(String name, String email_address) {
        this(name, email_address,200);
    }

    public VipCustmer(String name, String email_address, int credit) {
        this.name = name;
        this.email_address = email_address;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public int getCredit() {
        return credit;
    }
}
