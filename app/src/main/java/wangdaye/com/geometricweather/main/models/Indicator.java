package wangdaye.com.geometricweather.main.models;

import androidx.annotation.Nullable;

public class Indicator {

    public final int total;
    public final int index;

    public Indicator(int total, int index) {
        this.total = total;
        this.index = index;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Indicator) {
            return ((Indicator) obj).index == index && ((Indicator) obj).total == total;
        } else {
            return false;
        }
    }
}
