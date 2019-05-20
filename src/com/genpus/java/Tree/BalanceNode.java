package com.genpus.java.Tree;

/**
 * @author supeng/ supeng@bonc.com.cn
 * 分析：输入信息有 原成本 投入 赔率
 *              其中固定的是原成本 和赔率
 *              有变化的是每次的投入量多少，对应可以得出中或者赔的情况下的盈亏和结余
 * @date 2018/5/11 17:37
 * @Modified By:
 * @Description:
 */
public class BalanceNode
{
   //原成本 投入	赔率	中否	盈亏	结余
    public int cost;
    public int input;
    public int price;
    public char ifDrawPrize;
    public int profit;
    public int balance;

    public BalanceNode(int cost,  int price, char ifDrawPrize)
    {
        this.cost = cost;
        this.price = price;
        this.ifDrawPrize = ifDrawPrize;
    }


    public BalanceNode(int cost, int input, int price, char ifDrawPrize,int profit, int balance)
    {
        this.cost = cost;
        this.input = input;
        this.price = price;
        this.ifDrawPrize = ifDrawPrize;
        this.profit = profit;
        this.balance = balance;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Character getIfDrawPrize() {
        return ifDrawPrize;
    }

    public void setIfDrawPrize(Character ifDrawPrize) {
        this.ifDrawPrize = ifDrawPrize;
    }

    public int getBalance() {
        return balance;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
