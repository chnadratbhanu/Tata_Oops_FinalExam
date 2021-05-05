/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.Example01;

/**
 *
 * \
 */
public class Beer extends Alcohol {

    private boolean limit;

    public Beer(boolean limit, double alcoholPercentage, String alcoholType) {
        super(alcoholPercentage, alcoholType);
        this.limit = limit;
    }

    public boolean isLimit() {
        return limit;
    }

    @Override
    public String toString() {
        String conscious = "";
        String unconscious = "";
        if (limit) {
            conscious = "conscious";
        } else {
            unconscious = "unconscious";
        }
        return super.toString()
                + " and it is "
                + conscious;
    }

}
