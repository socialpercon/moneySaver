/*
 * THe business logic of the software.
 */
package moneysaver;

/**
 *
 * @author David
 */
public interface function {
 
    
    
    /* record the money spent in daily use 
     * @return the money spent in daily use.
     */
    public double daily();
    
    
    /* record the money spent spent in buying cloths 
     * @return the money spent in buying cloths.
     */
    public double cloth();
    
    
    /* record the money spent in buying food 
     * @return the money spent in buying food.
     */
    public double food();
    
    
    /* record the money spent in buying electronic stuff 
     * @return the money spent in buying electronic stuff.
     */
    public double electronic();
    
    
    
    /* record the money spent in hanging out
     * @return the money spent in hanging out.
     */
    public double play();
    
    
    /* record the money spent spent in buying snacks 
     * @return the money spent in buying snacks.
     */
    public double snacks();
    
    
    /* record the money spent spent in buying luxury 
     * @return the money spent in buying luxury.
     */
    public double luxury();
    
    
    /* record the money spent spent in other aspects 
     * @return the money spent in other aspects.
     */
    public double other();
    
    
//    /* count the rate of the money spent in a specific aspect to the total money spent.
//     * @return the rate of the money spent in a specific aspect to the total money spent.
//     */
//    public double countRate();
//    
//    
//    /* list the money spent on every aspects in a decreasing sequence. 
//     * @return the money spe    nt on every aspects in a decreasing sequence.
//     */
//    public void list();
//    
//    
//    /* display the money spent in different aspects.
//     * @return the value of money spent in different aspects.
//     */
//    public void display();
//    
//    
//    /* display the total money spent
//     * @return the value of money spent in total.
//     */
//    public double total();
    
    
    /* Find the aspect you spent the most money on
     * @return the money you spend on an aspect mostly 
     */
    public void getBiggest();
    
        
            
}
