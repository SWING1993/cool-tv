package com.swing.cooltv.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.swing.cooltv.model.TVChannelModel;
import com.swing.cooltv.model.TVSubChannelModel;

@RestController
public class TVDataController {

    @GetMapping("/")
    public String getTVData() {

        List<String> filenames = new ArrayList<String>(){{
            add("央视卫视高清频道");
            add("影视轮播频道");
            add("海外频道");
            add("浙江移动IPTV");
        }};

        List<TVChannelModel> models = new ArrayList<>();
        for (int i = 0; i < filenames.size(); i++) {
            String filename = filenames.get(i);
            TVChannelModel model = readFile(filename);
            models.add(model);
        }

        Gson gson = new Gson();
        String jsonStr = gson.toJson(models);
        return jsonStr;
    }


    public TVChannelModel readFile(String filename) {

        TVChannelModel channelModel = new TVChannelModel();
        channelModel.title = filename;
        ArrayList<TVSubChannelModel> models = new ArrayList();

        try {
            InputStream inputStream = TVDataController.class.getResourceAsStream("/" + filename);
            InputStreamReader read = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(read);

            ArrayList<String> names = new ArrayList();
            ArrayList<String> urls = new ArrayList();
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(",")) {
                    String url = line.split(",")[1];
                    names.add(url);
                }
                if (line.contains("http")) {
                    urls.add(line);
                }
            }
            for (int i = 0; i < names.size(); i++) {
                TVSubChannelModel model = new TVSubChannelModel();
                model.name = names.get(i);
                model.url = urls.get(i);
                models.add(model);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        channelModel.subChannels = models;
        return channelModel;
    }
}


