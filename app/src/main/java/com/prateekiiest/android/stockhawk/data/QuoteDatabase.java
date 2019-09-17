package com.prateekiiest.android.stockhawk.data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
  * Created by prateekiiest on 12/9/19.
 */
@Database(version = QuoteDatabase.VERSION)
public class QuoteDatabase {
    public static final int VERSION = 7;
    @Table(QuoteColumns.class)
    public static final String QUOTES = "quotes";

    private QuoteDatabase() {
    }
}