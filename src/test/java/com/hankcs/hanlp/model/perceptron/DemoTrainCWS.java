package com.hankcs.hanlp.model.perceptron;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DemoTrainCWS {
    public static void main(String[] args) throws IOException {
        String text = "同步相量测量装置定义修改、重启工作为防止调度数据跳变，需申请对500kV兰城变电站同步相量进行短时数据封锁。";
        String text1 = "1. 试验期间需多次投退阿海电厂全厂AGC、AVC功能，AGC、AVC不投入闭环模式。2. 在数据服务器重启、PLC程序下装、通信程序变更后重启等过程中，需要短期封锁全站数据。3. 在试验期间，电厂控制权将在金中集控、阿海电厂间来回多次切换，进行测试工作。";
        String text2 = "同步相量测量装置定义修改、重启工作为防止调度数据跳变，需申请对500kV兰城变电站同步相量进行短时数据封锁。";
        String text3 = "工作期间，需重启TASE2进程，需中调自动化值班员封锁数据，每次20分钟。";
        String text4 = "2019年12月9日发“35kV#1L-2电抗器组316断路器B相液压机构法兰盘螺栓连接处有浸油现象，经观察断路器液压机构油泵油基本漏完，但是液压机构打压正常，未发现异常。”重大缺陷，需2019-12-16 10:18前处理";

//        创建并处理数据集
//        File file = new File("D:\\Desktop\\data.txt");
//        if (!file.exists()) {
//            System.out.println("文件不存在!");
//            file.createNewFile();
//        }
//        Scanner scanner = new Scanner(System.in);
//        try {
//            while (scanner.hasNext()) {
//                String data = scanner.nextLine();
//                List<Term> result = HanLP.segment(data);
//                FileWriter writer = new FileWriter(file);
//                BufferedWriter out = new BufferedWriter(writer);
//                for (Term term : result) {
//                    System.out.println(term);
//                    out.write(term.toString() + " ");
//                    out.flush();
//                }
//                out.close();
//                writer.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        训练感知机模型
//        PerceptronTrainer trainer = new CWSTrainer();
//        PerceptronTrainer.Result result = trainer.train(
//                "data/test/mydata/data.txt",
//                "data/test/mydata/cws.bin"
//        );
//        System.out.printf("准确率F1:%.2f\n", result.getAccuracy());
//        PerceptronSegmenter segment = new PerceptronSegmenter(result.getModel());
//        System.out.println(segment.segment("工作期间，需重启1进程，需中调自动化值班员封锁数据，每次30分钟。"));

//        训练pos模型
//        PerceptronTrainer trainer = new POSTrainer();
//        trainer.train( "data/test/mydata/data.txt", "data/test/mydata/pos.bin");
//        PerceptronPOSTagger tagger = new PerceptronPOSTagger("data/test/mydata/pos.bin");
//        System.out.println(Arrays.toString(tagger.tag("工作期间，需重启1进程，需中调自动化值班员封锁数据，每次30分钟。")));

//        训练ner模型
//        PerceptronTrainer trainer = new NERTrainer();
//        trainer.train("data/test/mydata/data.txt", "data/test/mydata/ner.bin");

//        测试
        PerceptronLexicalAnalyzer analyzer = new PerceptronLexicalAnalyzer("data/test/mydata/cws.bin", "data/test/mydata/pos.bin","data/test/mydata/ner.bin");

        analyzer.enableCustomDictionary(true);
        System.out.println(analyzer.analyze(text));
}
}