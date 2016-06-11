/*
 *  Copyright (C) 2015, Jhuster, All Rights Reserved
 *
 *  Author:  Jhuster(lujun.hust@gmail.com)
 *  
 *  https://github.com/Jhuster/JNote
 *  
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; version 2 of the License.
 */
package com.geniusvjr.mengji.markdown.parser;


import com.geniusvjr.mengji.markdown.Markdown;

public class UnOrderListParser extends Markdown.MDParser {
    
    private static final char KEY = '-';

    @Override
    public Markdown.MDWord parseLineFmt(String content) {
        if (content.charAt(0)!=KEY) {
            return Markdown.MDWord.NULL;
        }
        return new Markdown.MDWord("",1,Markdown.MD_FMT_UNORDER_LIST);
    }

    @Override
    public Markdown.MDWord parseWordFmt(String content) {
        return Markdown.MDWord.NULL;
    }

}
