package com.example.chain_of_responsibility.practice;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final Support support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
            return null;
        } else if (next != null) {
            return next;
        } else {
            fail(trouble);
            return null;
        }
    }

    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

}
