/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/7 21:13</create-date>
 *
 * <copyright file="DemoAll.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.dictionary.stopword.CoreStopWordDictionary;
import com.hankcs.hanlp.mining.word.WordInfo;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.Viterbi.ViterbiSegment;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NotionalTokenizer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * 第一个Demo，惊鸿一瞥
 *
 * @author hankcs
 */
public class DemoAtFirstSight {
    public static void main(String[] args) throws IOException {
        String text = "同步相量测量装置定义修改、重启工作为防止调度数据跳变，需申请对500kV兰城变电站同步相量进行短时数据封锁。";
        String text1 = "1. 试验期间需多次投退阿海电厂全厂AGC、AVC功能，AGC、AVC不投入闭环模式。2. 在数据服务器重启、PLC程序下装、通信程序变更后重启等过程中，需要短期封锁全站数据。3. 在试验期间，电厂控制权将在金中集控、阿海电厂间来回多次切换，进行测试工作。";
        String text2 = "同步相量测量装置定义修改、重启工作为防止调度数据跳变，需申请对500kV兰城变电站同步相量进行短时数据封锁。";
        String text3 = "工作期间，需重启TASE2进程，需中调自动化值班员封锁数据，每次20分钟。";

//        System.out.println("首次编译运行时，HanLP会自动构建词典缓存，请稍候……");
//        HanLP.Config.enableDebug();         // 为了避免你等得无聊，开启调试模式说点什么:-)
//          List<String> result =  HanLP.extractKeyword("同步相量测量装置定义修改、重启工作为防止调度数据跳变，需申请对500kV兰城变电站同步相量进行短时数据封锁。",3);
//        for (String string : result) {
//            System.out.println(string);
//        }


//          使用自定义词典并提高优先级
        Segment segment = new ViterbiSegment();
        segment.enablePlaceRecognize(true);
        segment.enableCustomDictionary(true);
        segment.enableCustomDictionaryForcing(true);
        System.out.println(HanLP.segment(text3));
        System.out.println(HanLP.extractSummary(text3, 5));

//        按中文符号摘要;
//        List<String> result = HanLP.extractSummary(text1, 5);
//        for (String string : result) {
//            System.out.print(HanLP.segment(string));
//            List<Term> terms = HanLP.segment(string);
//            System.out.println("\n"+NotionalTokenizer.segment(terms.toString())+"\n");
//        }


    }
}
