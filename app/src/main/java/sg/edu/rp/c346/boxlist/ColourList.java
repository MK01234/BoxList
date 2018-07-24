package sg.edu.rp.c346.boxlist;

import java.util.Calendar;

/**
 * Created by 17045740 on 24/7/2018.
 */

public class ColourList{

        private boolean isblue;
        private boolean isorange;
        private boolean isbrown;


    public void setIsblue(boolean isblue) {
        this.isblue = isblue;
    }

    public boolean isIsorange() {
        return isorange;
    }

    public void setIsorange(boolean isorange) {
        this.isorange = isorange;
    }

    public boolean isIsbrown() {
        return isbrown;
    }

    public void setIsbrown(boolean isbrown) {
        this.isbrown = isbrown;
    }

    public boolean isIsblue() {
        return isblue;
    }

    public ColourList(boolean isblue , boolean isorange, boolean isbrown) {
            this.isblue = isblue;
            this.isorange = isorange;
            this.isbrown = isbrown;
        }

    @Override
    public String toString() {
        return "ColourList{" +
                "isblue=" + isblue +
                ", isorange=" + isorange +
                ", isbrown=" + isbrown +
                '}';
    }
}

