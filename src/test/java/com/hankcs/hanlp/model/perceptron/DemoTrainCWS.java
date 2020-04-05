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
        System.out.println(analyzer.analyze("1、根据工作需要向调度申请投、退全厂及机组AGC；2、根据工作需要向调度申请投、退全厂及机组AVC；3、根据工作需要求调申请数据封锁。"));
    }
}