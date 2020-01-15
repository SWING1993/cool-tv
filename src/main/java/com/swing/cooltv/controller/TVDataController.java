package com.swing.cooltv.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Dictionary;
import java.util.HashMap;

@RestController
public class TVDataController {

    @GetMapping("/")
    public String getTVData() {
        Gson gson = new Gson();
        String jsonStr = gson.toJson(configTVHashMap());
        return jsonStr;
    }

    public HashMap configTVHashMap() {
        HashMap tvHashMap = new HashMap();


        String v1 = "CCTV-4k,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000266303.m3u8\n" +
                "CCTV-1,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000210103.m3u8\n" +
                "CCTV-2,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000203603.m3u8\n" +
                "CCTV-3,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000203803.m3u8\n" +
                "CCTV-4,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000204803.m3u8\n" +
                "CCTV-5,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000205103.m3u8\n" +
                "CCTV-5+,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000204503.m3u8\n" +
                "CCTV-6,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000203303.m3u8\n" +
                "CCTV-7,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000510003.m3u8\n" +
                "CCTV-8,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000203903.m3u8\n" +
                "CCTV-9,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000499403.m3u8\n" +
                "CCTV-10,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000203503.m3u8\n" +
                "CCTV-11,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000204103.m3u8\n" +
                "CCTV-12,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000202603.m3u8\n" +
                "CCTV-13,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000204603.m3u8\n" +
                "CCTV-14,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000204403.m3u8\n" +
                "CCTV-15,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000205003.m3u8\n" +
                "CCTV-17,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000204203.m3u8";

        tvHashMap.put("央视高清频道", v1);

        String v2 = "湖南卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000296203.m3u8\n" +
                "东方卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000292403.m3u8\n" +
                "浙江卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000295503.m3u8\n" +
                "广东卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000292703.m3u8\n" +
                "江苏卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000295603.m3u8\n" +
                "深圳卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000292203.m3u8\n" +
                "黑龙江卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000293903.m3u8\n" +
                "辽宁卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000281301.m3u8\n" +
                "浙江卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000295501.m3u8\n" +
                "广东卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000292701.m3u8\n" +
                "江苏卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000295601.m3u8\n" +
                "深圳卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000292201.m3u8\n" +
                "东方卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000292401.m3u8\n" +
                "黑龙江卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000293901.m3u8\n" +
                "安微卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000298001.m3u8\n" +
                "重庆卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000297801.m3u8\n" +
                "东南卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000292501.m3u8\n" +
                "广西卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000294201.m3u8\n" +
                "贵州卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000293301.m3u8\n" +
                "河北卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000293401.m3u8\n" +
                "河南卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000296101.m3u8\n" +
                "湖北卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000294501.m3u8\n" +
                "江西卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000294101.m3u8\n" +
                "山东卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000294801.m3u8\n" +
                "四川卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000295001.m3u8\n" +
                "湖南卫视,http://140.249.30.118/tlivecloud-cdn.ysp.cctv.cn/2000296201.m3u8";
        tvHashMap.put("卫视高清频道", v2);


        String v3 = "黑帮电影,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_heibangdianying_1080p_t10/c16_lb_heibangdianying_1080p_t10.m3u8\n" +
                "电影大片,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_dianyingjingxuan_1080p_t10/c15_lb_dianyingjingxuan_1080p_t10.m3u8\n" +
                "热播电视剧,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_reboju_1080p_t10/c15_lb_reboju_1080p_t10.m3u8\n" +
                "家庭剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_jiatingjuchang_1080p_t10/c15_lb_jiatingjuchang_1080p_t10.m3u8\n" +
                "宫廷正剧,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_niandaijuchang_1080p_t10/c15_lb_niandaijuchang_1080p_t10.m3u8\n" +
                "经典重温,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_jingdianjuchang_1080p_t10/c16_lb_jingdianjuchang_1080p_t10.m3u8\n" +
                "收视冠军,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_dajuchongwen_1080p_t10/c15_lb_dajuchongwen_1080p_t10.m3u8\n" +
                "名侦探柯南,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_mingzhentankenan_1080p_t10/c15_lb_mingzhentankenan_1080p_t10.m3u8\n" +
                "喜剧大咖,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_xijudaka_1080p_t10/c15_lb_xijudaka_1080p_t10.m3u8\n" +
                "相声小品,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_xiangshengxiaopin_1080p_t10/c15_lb_xiangshengxiaopin_1080p_t10.m3u8\n" +
                "动作电影,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_dongzuodianying_1080p_t10/c16_lb_dongzuodianying_1080p_t10.m3u8\n" +
                "经典港片,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_jingdianguangpian_1080p_t10/c15_lb_jingdianguangpian_1080p_t10.m3u8\n" +
                "大头儿子,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_datouerzi_1080p_t10/c16_lb_datouerzi_1080p_t10.m3u8\n" +
                "喜羊羊,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_xiyangyang_1080p_t10/c15_lb_xiyangyang_1080p_t10.m3u8\n" +
                "哆啦A梦,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_duolaameng_1080p_t10/c15_lb_duolaameng_1080p_t10.m3u8\n" +
                "抗战剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_kangzhanjuchang_1080p_t10/c15_lb_kangzhanjuchang_1080p_t10.m3u8\n" +
                "儿歌大全,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_ergedaquan_1080p_t10/c15_lb_ergedaquan_1080p_t10.m3u8\n" +
                "神探狄仁杰,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_shentandirenjie_1080p_t10/c16_lb_shentandirenjie_1080p_t10.m3u8\n" +
                "纪晓岚,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_jixiaolan_1080p_t10/c16_lb_jixiaolan_1080p_t10.m3u8\n" +
                "人民的名义,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_renmindemingyi_1080p_t10/c16_lb_renmindemingyi_1080p_t10.m3u8\n" +
                "小说改编,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_xiaoshuogaibian_1080p_t10/c15_lb_xiaoshuogaibian_1080p_t10.m3u8\n" +
                "好莱坞大片,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_haolaiwudapian_1080p_t10/c16_lb_haolaiwudapian_1080p_t10.m3u8\n" +
                "老年剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_laonianjuchang_1080p_t10/c15_lb_laonianjuchang_1080p_t10.m3u8\n" +
                "怀旧剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_huaijiujuchang_1080p_t10/c16_lb_huaijiujuchang_1080p_t10.m3u8\n" +
                "五星影院,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_wuxingyingyuan_1080p_t10/c15_lb_wuxingyingyuan_1080p_t10.m3u8\n" +
                "喜剧电影,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_xijudianying_1080p_t10/c16_lb_xijudianying_1080p_t10.m3u8\n" +
                "周末影院,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_fengxiaogang_1080p_t10/c16_lb_fengxiaogang_1080p_t10.m3u8\n" +
                "情感调解,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_qinggantiaojie_1080p_t10/c15_lb_qinggantiaojie_1080p_t10.m3u8\n" +
                "历史秘闻,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_lishimiwen_1080p_t10/c15_lb_lishimiwen_1080p_t10.m3u8\n" +
                "奇妙世界,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_qimiaoshijie_1080p_t10/c16_lb_qimiaoshijie_1080p_t10.m3u8\n" +
                "科学探索,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_kexuetansuo_1080p_t10/c16_lb_kexuetansuo_1080p_t10.m3u8\n" +
                "军事观察,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_junshinew_1080p_t10/c16_lb_junshinew_1080p_t10.m3u8\n";
        tvHashMap.put("虎牙影视轮播", v3);

        String v4 = "电影大片,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_dianyingjingxuan_1080p_t10/c15_lb_dianyingjingxuan_1080p_t10.m3u8\n" +
                "贺岁影院,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_haolaiwudapian_1080p_t10/c16_lb_haolaiwudapian_1080p_t10.m3u8\n" +
                "豆瓣高分,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_wuxingyingyuan_1080p_t10/c15_lb_wuxingyingyuan_1080p_t10.m3u8\n" +
                "动作电影,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_dongzuodianying_1080p_t10/c16_lb_dongzuodianying_1080p_t10.m3u8\n" +
                "票房收割机,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_heibangdianying_1080p_t10/c16_lb_heibangdianying_1080p_t10.m3u8\n" +
                "欢乐剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_xijudianying_1080p_t10/c16_lb_xijudianying_1080p_t10.m3u8\n" +
                "经典港片,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_jingdianguangpian_1080p_t10/c15_lb_jingdianguangpian_1080p_t10.m3u8\n" +
                "惊悚午夜场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_jingnawuyechang_1080p_t10/c16_lb_jingnawuyechang_1080p_t10.m3u8\n" +
                "动画电影,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_donghuadianying_1080p_t10/c16_lb_donghuadianying_1080p_t10.m3u8\n" +
                "华语院线,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_huayuyuanxian_1080p_t10/c16_lb_huayuyuanxian_1080p_t10.m3u8\n" +
                "粤语原生,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_yueyuyuansheng_1080p_t10/c16_lb_yueyuyuansheng_1080p_t10.m3u8\n" +
                "怀旧剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_huaijiujuchang_1080p_t10/c16_lb_huaijiujuchang_1080p_t10.m3u8\n" +
                "日韩院线,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_rihanyuanxian_1080p_t10/c16_lb_rihanyuanxian_1080p_t10.m3u8\n" +
                "温情影院,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_chenglong_1080p_t10/c15_lb_chenglong_1080p_t10.m3u8\n" +
                "周末影院,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_fengxiaogang_1080p_t10/c16_lb_fengxiaogang_1080p_t10.m3u8\n" +
                "婚姻剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_hunyinjuchang_1080p_t10/c16_lb_hunyinjuchang_1080p_t10.m3u8\n" +
                "权谋剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_quanmojuchang_1080p_t10/c16_lb_quanmojuchang_1080p_t10.m3u8\n" +
                "经典重温,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_jingdianjuchang_1080p_t10/c16_lb_jingdianjuchang_1080p_t10.m3u8\n" +
                "谍战剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_diezhanjuchang_1080p_t10/c16_lb_diezhanjuchang_1080p_t10.m3u8\n" +
                "军旅剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_junlvjuchang_1080p_t10/c16_lb_junlvjuchang_1080p_t10.m3u8\n" +
                "情景喜剧,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_kaixinjuchang_1080p_t10/c16_lb_kaixinjuchang_1080p_t10.m3u8\n" +
                "老剧超清修复,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_longmenbiaoju_1080p_t10/c16_lb_longmenbiaoju_1080p_t10.m3u8\n" +
                "收视冠军,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_dajuchongwen_1080p_t10/c15_lb_dajuchongwen_1080p_t10.m3u8\n" +
                "老年剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_laonianjuchang_1080p_t10/c15_lb_laonianjuchang_1080p_t10.m3u8\n" +
                "仙侠玄幻,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_qingshenshenyumengmeng_1080p_t10/c15_lb_qingshenshenyumengmeng_1080p_t10.m3u8\n" +
                "青春剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_weizhangzhe_1080p_t10/c15_lb_weizhangzhe_1080p_t10.m3u8\n" +
                "宫廷正剧,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_niandaijuchang_1080p_t10/c15_lb_niandaijuchang_1080p_t10.m3u8\n" +
                "家庭剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_jiatingjuchang_1080p_t10/c15_lb_jiatingjuchang_1080p_t10.m3u8\n" +
                "抗战剧场,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_kangzhanjuchang_1080p_t10/c15_lb_kangzhanjuchang_1080p_t10.m3u8\n" +
                "热播电视剧,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_reboju_1080p_t10/c15_lb_reboju_1080p_t10.m3u8\n" +
                "历史秘闻,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_lishimiwen_1080p_t10/c15_lb_lishimiwen_1080p_t10.m3u8\n" +
                "旅游攻略,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_lvyounew_1080p_t10/c15_lb_lvyounew_1080p_t10.m3u8\n" +
                "军事观察,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_junshinew_1080p_t10/c16_lb_junshinew_1080p_t10.m3u8\n" +
                "童年经典,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_balalaxiaomoxian_1080p_t10/c15_lb_balalaxiaomoxian_1080p_t10.m3u8\n" +
                "动画小天地,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_dishine_1080p_t10/c15_lb_dishine_1080p_t10.m3u8\n" +
                "动物兄弟,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_yingshijinqu_1080p_t10/c16_lb_yingshijinqu_1080p_t10.m3u8\n" +
                "怀旧动画,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_huanjiudongman_1080p_t10/c15_lb_huanjiudongman_1080p_t10.m3u8\n" +
                "儿童乐园,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c15_lb_dongmantiandi_1080p_t10/c15_lb_dongmantiandi_1080p_t10.m3u8\n" +
                "亲子启蒙,http://101.72.196.41/r/baiducdnct.inter.iqiyi.com/tslive/c16_lb_qinziqimeng_1080p_t10/c16_lb_qinziqimeng_1080p_t10.m3u8\n";

        tvHashMap.put("爱奇艺影视轮播", v4);

        return tvHashMap;
    }

}


