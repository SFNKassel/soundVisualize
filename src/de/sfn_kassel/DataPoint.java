package de.sfn_kassel;

/**
 * Created by robin on 20.05.16.
 */
public class DataPoint {
    public final double x;
    public final double y;
    public final double z;
    public final double amplitude;
    public final double freq;

    public DataPoint(double x, double y, double z, double amplitude, double freq) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.amplitude = amplitude;
        this.freq = freq;
    }
}
