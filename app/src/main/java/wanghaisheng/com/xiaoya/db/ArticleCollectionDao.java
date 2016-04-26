package wanghaisheng.com.xiaoya.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import wanghaisheng.com.xiaoya.db.ArticleCollection;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ARTICLE_COLLECTION".
*/
public class ArticleCollectionDao extends AbstractDao<ArticleCollection, Long> {

    public static final String TABLENAME = "ARTICLE_COLLECTION";

    /**
     * Properties of entity ArticleCollection.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Date_published = new Property(2, String.class, "date_published", false, "DATE_PUBLISHED");
        public final static Property Info = new Property(3, String.class, "info", false, "INFO");
        public final static Property Image = new Property(4, String.class, "image", false, "IMAGE");
        public final static Property Description = new Property(5, String.class, "description", false, "DESCRIPTION");
        public final static Property Comment_count = new Property(6, Integer.class, "comment_count", false, "COMMENT_COUNT");
        public final static Property Url = new Property(7, String.class, "url", false, "URL");
        public final static Property Channel_keys = new Property(8, String.class, "channel_keys", false, "CHANNEL_KEYS");
    };


    public ArticleCollectionDao(DaoConfig config) {
        super(config);
    }
    
    public ArticleCollectionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ARTICLE_COLLECTION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"DATE_PUBLISHED\" TEXT," + // 2: date_published
                "\"INFO\" TEXT," + // 3: info
                "\"IMAGE\" TEXT," + // 4: image
                "\"DESCRIPTION\" TEXT," + // 5: description
                "\"COMMENT_COUNT\" INTEGER," + // 6: comment_count
                "\"URL\" TEXT," + // 7: url
                "\"CHANNEL_KEYS\" TEXT);"); // 8: channel_keys
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ARTICLE_COLLECTION\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ArticleCollection entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String date_published = entity.getDate_published();
        if (date_published != null) {
            stmt.bindString(3, date_published);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(4, info);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(5, image);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(6, description);
        }
 
        Integer comment_count = entity.getComment_count();
        if (comment_count != null) {
            stmt.bindLong(7, comment_count);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(8, url);
        }
 
        String channel_keys = entity.getChannel_keys();
        if (channel_keys != null) {
            stmt.bindString(9, channel_keys);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ArticleCollection readEntity(Cursor cursor, int offset) {
        ArticleCollection entity = new ArticleCollection( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // date_published
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // info
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // image
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // description
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // comment_count
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // url
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // channel_keys
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ArticleCollection entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDate_published(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setInfo(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImage(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDescription(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setComment_count(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setChannel_keys(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ArticleCollection entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ArticleCollection entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}