package com.intelliviz.stockhawk.data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
 * Created by sans on 06/17/2016.
 */
@Database(version = QuoteDatabase.VERSION,
        packageName = "com.intelliviz.stockhawk.data.provider")
public class QuoteDatabase {
  private QuoteDatabase(){}

  public static final int VERSION = 7;

  @Table(QuoteColumns.class) public static final String QUOTES = "quotes";
}
