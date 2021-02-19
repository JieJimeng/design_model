package per;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/19 17:57
 * @Version 1.0
 **/
public interface AbstractFile {
    void kill();
}


class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("----图像文件"+name+",kill");
    }
}


class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("----文本文件"+name+",kill");
    }
}


class VideoFile implements AbstractFile {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("----视频文件"+name+",kill");
    }
}

class Folder implements AbstractFile {

    private String name;
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("----视频文件"+name+",kill");

        for (AbstractFile file : list) {
            file.kill();
        }
    }

    void add(AbstractFile file) {
        list.add(file);
    }
}
