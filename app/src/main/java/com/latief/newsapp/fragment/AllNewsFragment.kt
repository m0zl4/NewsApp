package com.latief.newsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.latief.newsapp.R
import com.latief.newsapp.adapter.NewsAdapter
import com.latief.newsapp.data.DataNews
import com.latief.newsapp.initViewHeadline

class AllNewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_news, container, false)

        val imageNewsHeadline : ImageView = view.findViewById(R.id.img_news_headline)
        val titleNewsHeadline : TextView = view.findViewById(R.id.tv_title_headline)
        val descNewsHeadline : TextView = view.findViewById(R.id.tv_desc_headline)
        val authorNewsHeadline : TextView = view.findViewById(R.id.tv_author_headline)
        val dateNewsHeadline : TextView = view.findViewById(R.id.tv_date_headline)

        val rvNews = view.findViewById<RecyclerView>(R.id.rv_all_news)
        rvNews.layoutManager = LinearLayoutManager(view.context)
        rvNews.adapter = NewsAdapter(DataNews.dataAllNews)

        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initViewHeadline(view.context, view, 0)

        return view
    }
}