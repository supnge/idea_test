package com.genpus.java.Tree;

/**
 * @author supeng/ supeng@bonc.com.cn
 * @date 2018/5/11 18:30
 * @Modified By:
 * @Description:
 */
public class BTree {

    public int cost;
    public int input;
    public int price;
    public String ifDrawPrize;
    public int profit;
    public int balance;
    BalanceNode balanceNode ;

    public BalanceNode constructChildNode()
    {
        cost = 10000;
        price = 3;

        // 节点1 投入：500
        input = 500;

        BalanceNode lbalanceNode = new BalanceNode(10000, 3, 'Y');
        BalanceNode rbalanceNode = new BalanceNode(10000, 3,'N');



       return null;
    }

    public static void main(String[] args) {

    }
}
