/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator1;

/**
 *
 * @author user
 */
public class Developer implements Collection{
    
    private String name;
     private String[] skills;

    public Developer(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }
    
   
   
   public String getName() {
        return name;
    }
   public String[] getSkills(){
       return skills;
   }
   public void setName(String name){
       this.name = name;
   }
   public void setSkills(String[] skills){
       this.skills = skills;
   }
   @Override
    public Iterator getIterator(){
        return new SkillIterator();
    }
    private class SkillIterator implements Iterator{
        int index;
       @Override
    public boolean hasNext(){
        if(index<skills.length){
        return true;
    }
    return false;
    }

    public Object nxt(){
        return skills[index++];
    }

        @Override
        public Object next() {
           return skills[index++];
        }
    
    }  
}
