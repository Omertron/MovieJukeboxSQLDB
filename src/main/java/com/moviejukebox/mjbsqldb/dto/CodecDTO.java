/*
 *      Copyright (c) 2004-2015 YAMJ Members
 *      http://code.google.com/p/moviejukebox/people/list
 *
 *      This file is part of the Yet Another Movie Jukebox (YAMJ).
 *
 *      The YAMJ is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      YAMJ is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with the YAMJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 *      Web: http://code.google.com/p/moviejukebox/
 *
 */
package com.moviejukebox.mjbsqldb.dto;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CodecDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME   = "CODEC";
    public static final String TABLE_KEY    = "ID";
    public static final String CREATE_TABLE = "create table if not exists " + TABLE_NAME +
                " (ID integer primary key, CODEC text, TYPE text)";
    public static final String INSERT_TABLE = "insert into " + TABLE_NAME +
                " (ID, CODEC, TYPE) values (?, ?, ?)";
    public static final String DROP_TABLE   = "drop table if exists " + TABLE_NAME;

    public static final String TYPE_AUDIO = "AUDIO";
    public static final String TYPE_VIDEO = "VIDEO";

    private int     id;
    private String  codec;
    private String  type;

    public CodecDTO() {
        super();
        this.id = 0;    // Set to the default of 0 (zero)
    }

    public CodecDTO(int id, String codec, String type) {
        super();
        this.id = id;
        this.codec = codec;
        this.type = type;
    }

    public void populateDTO(ResultSet rs) throws SQLException {
        setId(rs.getInt("ID"));
        setCodec(rs.getString("CODEC"));
        setType(rs.getString("TYPE"));
    }

    public String getCodec() {
        return codec;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CodecDTO [id=" + id + ", codec=" + codec + ", type=" + type + "]";
    }

}
