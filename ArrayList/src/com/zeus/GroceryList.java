package com.zeus;
import java.util.ArrayList;
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String Item){
        groceryList.add(Item.toLowerCase());
    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in Grocery List");
        for(int i = 0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }

    }
    public void modifyGroceryItem(String currentItem,String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item "+ (position+1)+ "has been modified. ");
    }
    public void removeGroceryItem(String Item){
        int position = findItem(Item);
        if(position >= 0){
            removeGroceryItem(position);
        }

    }
    private void removeGroceryItem(int position){

        groceryList.remove(position);
        System.out.println("Item has been Removed");
    }
    public int findItem(String searchItem){
        return groceryList.indexOf(searchItem.toLowerCase());
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }

}
