package com.example.qingchanghan.tab;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qingchang Han on 2016/12/31.
 */

@SuppressLint("ValidFragment")
public class Fragment1 extends Fragment {

    private String content;
    private List<Book> bookList = new ArrayList<Book>();

    public Fragment1(String content) {
        super();
        this.content = content;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_book,container,false);//这里改成自己的layout
        initBooks();
        BookAdapter adapter = new BookAdapter(MyApplication.getContext(), R.layout.list_item, bookList);
        ListView listView = (ListView) view.findViewById(R.id.book_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Book book = bookList.get(position);
                Toast.makeText(MyApplication.getContext(), book.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    private void initBooks() {
        Book book1 = new Book("罗曼蒂克消亡史", "程耳", "9787210075073", R.mipmap.luomandikexiaowangshi);
        bookList.add(book1);
        Book book2 = new Book("山海经全译", "袁珂", "9787550284913", R.mipmap.shanhaijingquanyi);
        bookList.add(book2);
        Book book3 = new Book("金色梦乡", "[日]伊坂幸太郎", "9787544285025", R.mipmap.jinsemengxiang);
        bookList.add(book3);
        Book book4 = new Book("猎豹", "尤·奈斯博", "9787540578162", R.mipmap.liebao);
        bookList.add(book4);
        Book book5 = new Book("读在大好时光", "魏小河", "9787807681670", R.mipmap.duzaidahaoshiguang);
        bookList.add(book5);
        Book book6 = new Book("最美的生命", "丹真绒布", "9787561387672", R.mipmap.zuimeideshengming);
        bookList.add(book6);
        Book book7 = new Book("浮生六记", "沈复", "9787201094014", R.mipmap.fushengliuji);
        bookList.add(book7);
        Book book8 = new Book("夜色人生", "丹尼斯·勒翰", "9787539992426", R.mipmap.yeserensheng);
        bookList.add(book8);
        Book book9 = new Book("自在独行", "贾平凹", "9787535488473", R.mipmap.zizaiduxing);
        bookList.add(book9);
        Book book10 = new Book("追风筝的人", "卡勒德胡赛尼", "9787208061644", R.mipmap.zhuifengzhengderen);
        bookList.add(book10);
        Book book11 = new Book("活着", "余华", "978750636437", R.mipmap.huozhe);
        bookList.add(book11);
        Book book12 = new Book("白夜行", "东野奎吾", "9787544258609", R.mipmap.baiyexing);
        bookList.add(book12);
    }
}
