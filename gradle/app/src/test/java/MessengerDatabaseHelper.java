import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MessengerDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "messenger.db";
    private static final int DATABASE_VERSION = 1;

    public MessengerDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create necessary tables
        db.execSQL("CREATE TABLE conversations (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade the database schema if needed
        db.execSQL("DROP TABLE IF EXISTS conversations");
        onCreate(db);
    }
}
