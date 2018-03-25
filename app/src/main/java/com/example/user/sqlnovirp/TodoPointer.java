package com.example.user.sqlnovirp;

import android.provider.BaseColumns;

/**
 * Created by waski on 24/03/2018.
 */

public class TodoPointer {
    private TodoPointer(){}
    public static final class TodoEntry implements BaseColumns {
        public static final String TABLE_NAME = "TodoActivity";
        public static final String COLUMN_NAMA_ = "namaActivity";
        public static final String COLUMN_DESKRIPSI = "deskripsi";
        public static final String COLUMN_PRIOTIRTY = "priority";
    }

}
