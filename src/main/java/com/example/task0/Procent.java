package com.example.task0;

public class Procent {
    private float sum_;
    public Procent(float sum)
    {
        sum_ = sum;
    }
    public Procent()
    {
        sum_ = 0;
    }
    public float countPr(int pr)
    {
        return (pr*this.sum_)/100;
    }
    public int countPrR(int pr)
    {
        return Math.round((pr*this.sum_)/100);
    }

    public float countSum(float sum, float pr)
    {
        return sum + countPr((int)pr);
    }
    public  int countSumrnd(int pr)
    {
        return Math.round(countSum(sum_,pr));
    }
    public void setSum(float value) {sum_ = value;}
    public float getSum() {return sum_;}
}
