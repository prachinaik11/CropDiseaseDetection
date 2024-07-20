package com.soumio.inceptiontutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;

public class Solution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        WebView w=(WebView)findViewById(R.id.webView);
        HashMap<String, String> solution = new HashMap<>();
        Intent it=getIntent();
        Bundle extras = it.getExtras();
        String tmp = extras.getString("solution");
        solution.put("alterania leafspot cotton","https://www.cropscience.bayer.com/en/crop-compendium/pests-diseases-weeds/diseases/alternaria-spp-cotton");

        solution.put("anthracnose cotton","https://www.planetnatural.com/pest-problem-solutionver/plant-disease/anthracnose/");

        solution.put("apple apple scab","https://www.planetnatural.com/pest-problem-solutionver/plant-disease/apple-scab/");

        solution.put("apple black rot","https://en.wikipedia.org/wiki/Black_rot");

        solution.put("ascochyta blight cotton","https://www.plantwise.org/KnowledgeBank/Datasheet.aspx?dsid=7310");

        solution.put("bacterial blight cotton","https://en.wikipedia.org/wiki/Bacterial_blight_of_cotton");

        solution.put("bacterial stalk rot of maize","https://plantix.net/plant-disease/en/300035/bacterial-stalk-rot-of-maize");

        solution.put("blotch wheat","https://en.wikipedia.org/wiki/Spot_blotch_(wheat)");

        solution.put("boron deficiency in maize","https://en.wikipedia.org/wiki/Boron_deficiency_(plant_disorder)");

        solution.put("brown spot of maize","https://www.plantwise.org/KnowledgeBank/Datasheet.aspx?dsid=40770");

        solution.put("calcium deficiency in maize","https://en.wikipedia.org/wiki/Calcium_deficiency_(plant_disorder)");

        solution.put("calcium deficiency wheat","https://en.wikipedia.org/wiki/Calcium_deficiency_(plant_disorder)");

        solution.put("common bunt wheat","https://en.wikipedia.org/wiki/Common_bunt");

        solution.put("common rust in maize","https://www.plantwise.org/KnowledgeBank/Datasheet.aspx?dsid=45872");

        solution.put("cotton rust","https://www.planetnatural.com/pest-problem-solutionver/plant-disease/common-rust/");

        solution.put("zinc deficiency wheat","https://en.wikipedia.org/wiki/Zinc_deficiency_(plant_disorder)#Treatment");

        solution.put("zinc deficiency in maize","https://en.wikipedia.org/wiki/Zinc_deficiency_(plant_disorder)#Treatment");

        solution.put("yellow dwarf wheat","https://en.wikipedia.org/wiki/Barley_yellow_dwarf#Control");

        solution.put("wheat blast","https://en.wikipedia.org/wiki/Magnaporthe_grisea");

        solution.put("violet stem borer in maize","https://plantix.net/plant-disease/en/600213/violet-stem-borer-in-maize");

        solution.put("stunt of maize","https://plantvillage.psu.edu/topics/corn-maize/infos");

        solution.put("stink bugs on maize millet and sorghum","https://plantix.net/plant-disease/en/600051/stink-bugs-on-maize-millet-and-sorghum");

        solution.put("stem rust wheat","https://www.agric.wa.gov.au/grains-research-development/managing-stem-rust-wheat?page=0%2C3#smartpaging_toc_p3_s1_h2");

        solution.put("spotted stemborer in maize","http://agritech.tnau.ac.in/crop_protection/crop_prot_crop_insectpest%20_cereals_maize.html");

        solution.put("southern rust of maize","https://cropwatch.unl.edu/plantdisease/corn/southern-rust");

        solution.put("southern leaf blight of maize","https://www.pioneer.com/home/site/us/agronomy/crop-management/corn-insect-disease/southern-leaf-blight/");

        solution.put("powdery mildew cotton","https://en.wikipedia.org/wiki/Powdery_mildew#Management");

        solution.put("pearl millet ergot","https://plantix.net/plant-disease/en/100054/pearl-millet-ergot");

        solution.put("peach bacterial spot","https://plantix.net/plant-disease/en/300024/bacterial-spot-on-stone-fruits");

        solution.put("lesser stalk borer of maize","https://www.pioneer.com/home/site/us/agronomy/crop-management/corn-insect-disease/common-stalk-borer/");

        solution.put("leaf rust wheat","https://en.wikipedia.org/wiki/Wheat_leaf_rust#Control");

        solution.put("leaf rednning cotton","https://plantix.net/plant-disease/en/900018/leaf-reddening-of-cotton");

        solution.put("karnal bunt wheat","https://en.wikipedia.org/wiki/Karnal_bunt#Management");

        solution.put("iron deficiency in maize","https://plantix.net/plant-disease/en/700059/iron-deficiency-in-maize");

        solution.put("gray leaf spot in maize","https://www.pioneer.com/home/site/us/agronomy/crop-management/corn-insect-disease/gray-leaf-spot/");

        solution.put("gibberella stalk rot of maize","https://www.pioneer.com/home/site/us/agronomy/crop-management/corn-insect-disease/gibberella-stalk-rot/");

        solution.put("fall armyworm in maize","https://entomology.ca.uky.edu/ef110");

        solution.put("eyespot of maize","https://plantix.net/plant-disease/en/100176/eyespot-of-maize");

        solution.put("european maize borer","https://en.wikipedia.org/wiki/European_corn_borer");

        solution.put("magnesium deficiency in maize","https://www.pioneer.com/home/site/us/agronomy/magnesium-deficiency-corn/");

        solution.put("maize chlorotic mottle virus","https://www.plantwise.org/KnowledgeBank/Datasheet.aspx?dsID=32129");

        solution.put("maize earworm","https://www.gardeningknowhow.com/plant-problems/pests/insects/corn-earworm-control.htm");

        solution.put("maize leaf streak virus","https://www.planetnatural.com/pest-problem-solutionver/plant-disease/mosaic-virus/");

        solution.put("maize lethal necrosis disease","https://plantix.net/plant-disease/en/200022/maize-lethal-necrosis-disease");

        solution.put("maize smut","https://plantix.net/plant-disease/en/100038/maize-smut");

        solution.put("manganese deficiency in maize","https://en.wikipedia.org/wiki/Manganese_deficiency_(plant)");

        solution.put("millet cercospora leaf spot","https://plantix.net/plant-disease/en/100091/millet-cercospora-leaf-spot");

        solution.put("millet rust","https://plantix.net/plant-disease/en/100089/millet-rust");

        solution.put("northern leaf blight of maize","https://plantix.net/plant-disease/en/100065/northern-leaf-blight-of-maize");

        solution.put("northern leaf spot of maize","https://en.wikipedia.org/wiki/Northern_corn_leaf_blight");

        solution.put("downy mildew millet","http://agropedia.iitk.ac.in/content/downy-mildew-pearl-millet");
         //solutionution.get(tmp);
        w.getSettings().setJavaScriptEnabled(true);
        w.setWebChromeClient(new WebChromeClient());

        w.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        w.loadUrl(solution.get(TEST.name));
    }
}
