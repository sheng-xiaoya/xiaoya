package wanghaisheng.com.xiaoya.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import wanghaisheng.com.xiaoya.db.MovieCollection;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MOVIE_COLLECTION".
*/
public class MovieCollectionDao extends AbstractDao<MovieCollection, Long> {

    public static final String TABLENAME = "MOVIE_COLLECTION";

    /**
     * Properties of entity MovieCollection.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ShowInfo = new Property(1, String.class, "showInfo", false, "SHOW_INFO");
        public final static Property Scm = new Property(2, String.class, "scm", false, "SCM");
        public final static Property Dir = new Property(3, String.class, "dir", false, "DIR");
        public final static Property Star = new Property(4, String.class, "star", false, "STAR");
        public final static Property Cat = new Property(5, String.class, "cat", false, "CAT");
        public final static Property Wish = new Property(6, Integer.class, "wish", false, "WISH");
        public final static Property Value3d = new Property(7, Boolean.class, "value3d", false, "VALUE3D");
        public final static Property Nm = new Property(8, String.class, "nm", false, "NM");
        public final static Property Imax = new Property(9, Boolean.class, "imax", false, "IMAX");
        public final static Property Snum = new Property(10, Integer.class, "snum", false, "SNUM");
        public final static Property Sc = new Property(11, String.class, "sc", false, "SC");
        public final static Property Ver = new Property(12, String.class, "ver", false, "VER");
        public final static Property Rt = new Property(13, String.class, "rt", false, "RT");
        public final static Property Img = new Property(14, String.class, "img", false, "IMG");
        public final static Property Dur = new Property(15, String.class, "dur", false, "DUR");
        public final static Property Is_collected = new Property(16, Boolean.class, "is_collected", false, "IS_COLLECTED");
    };


    public MovieCollectionDao(DaoConfig config) {
        super(config);
    }
    
    public MovieCollectionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MOVIE_COLLECTION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SHOW_INFO\" TEXT," + // 1: showInfo
                "\"SCM\" TEXT," + // 2: scm
                "\"DIR\" TEXT," + // 3: dir
                "\"STAR\" TEXT," + // 4: star
                "\"CAT\" TEXT," + // 5: cat
                "\"WISH\" INTEGER," + // 6: wish
                "\"VALUE3D\" INTEGER," + // 7: value3d
                "\"NM\" TEXT," + // 8: nm
                "\"IMAX\" INTEGER," + // 9: imax
                "\"SNUM\" INTEGER," + // 10: snum
                "\"SC\" TEXT," + // 11: sc
                "\"VER\" TEXT," + // 12: ver
                "\"RT\" TEXT," + // 13: rt
                "\"IMG\" TEXT," + // 14: img
                "\"DUR\" TEXT," + // 15: dur
                "\"IS_COLLECTED\" INTEGER);"); // 16: is_collected
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MOVIE_COLLECTION\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MovieCollection entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String showInfo = entity.getShowInfo();
        if (showInfo != null) {
            stmt.bindString(2, showInfo);
        }
 
        String scm = entity.getScm();
        if (scm != null) {
            stmt.bindString(3, scm);
        }
 
        String dir = entity.getDir();
        if (dir != null) {
            stmt.bindString(4, dir);
        }
 
        String star = entity.getStar();
        if (star != null) {
            stmt.bindString(5, star);
        }
 
        String cat = entity.getCat();
        if (cat != null) {
            stmt.bindString(6, cat);
        }
 
        Integer wish = entity.getWish();
        if (wish != null) {
            stmt.bindLong(7, wish);
        }
 
        Boolean value3d = entity.getValue3d();
        if (value3d != null) {
            stmt.bindLong(8, value3d ? 1L: 0L);
        }
 
        String nm = entity.getNm();
        if (nm != null) {
            stmt.bindString(9, nm);
        }
 
        Boolean imax = entity.getImax();
        if (imax != null) {
            stmt.bindLong(10, imax ? 1L: 0L);
        }
 
        Integer snum = entity.getSnum();
        if (snum != null) {
            stmt.bindLong(11, snum);
        }
 
        String sc = entity.getSc();
        if (sc != null) {
            stmt.bindString(12, sc);
        }
 
        String ver = entity.getVer();
        if (ver != null) {
            stmt.bindString(13, ver);
        }
 
        String rt = entity.getRt();
        if (rt != null) {
            stmt.bindString(14, rt);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(15, img);
        }
 
        String dur = entity.getDur();
        if (dur != null) {
            stmt.bindString(16, dur);
        }
 
        Boolean is_collected = entity.getIs_collected();
        if (is_collected != null) {
            stmt.bindLong(17, is_collected ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MovieCollection readEntity(Cursor cursor, int offset) {
        MovieCollection entity = new MovieCollection( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // showInfo
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // scm
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dir
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // star
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // cat
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // wish
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // value3d
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // nm
            cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0, // imax
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // snum
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // sc
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // ver
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // rt
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // img
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // dur
            cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0 // is_collected
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MovieCollection entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setShowInfo(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setScm(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDir(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCat(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setWish(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setValue3d(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setNm(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setImax(cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0);
        entity.setSnum(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setSc(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setVer(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRt(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setImg(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setDur(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setIs_collected(cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(MovieCollection entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(MovieCollection entity) {
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