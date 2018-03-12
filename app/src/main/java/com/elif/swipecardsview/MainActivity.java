package com.elif.swipecardsview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.huxq17.swipecardsview.SwipeCardsView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SwipeCardsView swipeCardsView;
    private List<SwipeCardsViewModel> diyetIpuclariModelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipeCardsView= (SwipeCardsView) findViewById(R.id.swipeCardsView);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);
        getData();

    }
    private void getData() {
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Bol Su veya Kalorisiz İçecek İçin","Elinizi patates cipsi torbasına daldırmadan önce bir bardak su için. İnsanlar bazen açlıkla susuzluğu birbirine karıştırır, yani, tüm gereken şey buz gibi bir bardak suyken sonunuz fazladan kalorileri tıkınmak olabilir. Yalnızca su sizi tatmin etmiyorsa tatlandırılmış su, soda içmeyi veya bir bardak bitki çayı demlemeyi deneyebilirsiniz."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Gece Atıştırmalarında Seçici Olun","Düşüncesiz yemeler genellikle akşam yemeğinden sonra olmaktadır, yani günün sonunda nihayet oturup rahatlayabildiğiniz vakitte. Televizyonun önünde atıştırmak diyetten vazgeçmenin en kolay yoludur. Ya belli bir saatten sonra mutfağın kapısına kilit koyun ya da kendinize sadece düşük kalorili yiyecekler için izin verin."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("En Sevdiğiniz Yiyeceklerin Tadını Çıkarın","En sevdiğiniz yemekleri tamamen menüden çıkarmak yerine cimri davranın. Koca bir kutu kurabiye veya bir torba şeker yerine tadımlıkla yetinin. Sevdiğiniz yiyeceklerin keyfini sürmeye devam edebilirsiniz, işin püf noktası ölçülü olmaktır."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Gün İçinde Çok Sayıda Küçük Öğün Yiyin","Yaktıklarınızdan daha az kalori tüketirseniz, kilo kaybedersiniz. Fakat sürekli aç dolaşırsanız, çok az yemek zor bir iş olabilir. Araştırmalar gösteriyor ki günde 4-5 öğünü veya atıştırması olan insanlar kendi kilolarını ve iştahlarını daha iyi kontrol edebilmektedir. Günlük kalorilerinizi küçük öğünlere bölün ve onların çoğunu günün erken saatlerine alın, akşam yemeği son öğününüz olsun."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Her Öğün Protein Alın","Protein karnınızı kesin doyuracak olan şeydir – karbonhidratlar ve yağlara göre daha iyi doyurur ve karnı daha uzun süre tok tutar. Ayrıca kas kitlesini daha iyi korumaya yardım ederek yağ yakmayı teşvik eder. Bu yüzden yağsız et, yoğurt, balık, fındık fıstık veya fasulyeler gibi sağlıklı proteinleri öğünlerinize katmanın bir yolunu bulun."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Baharatlandırın","Yiyeceğin sizi tatmin etmesi için gereken tatları ve baharatları öğünlerinize ekleyin. Kokulu ve tadı hoş yiyecekler sizin tat duygunuzu tatmin eder, bu yüzden fazla yemezsiniz. Tatlı bir şey yediğiniz zaman, baharatlı bir şeker emin. Tericihinizi tatlı, baharatlı ve kalorisi düşük olanlardan yana kullanın."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Mutfağınızı Sağlıklı, Doğru Gıdalarla Doldurun","Elinizin altında hemen atıştırabileceğiniz sağlıklı şeyler olması başarıya giden yolu düzleştirir. Eğer 10 dakikada sağlıklı bir yiyecek hazırlayabiliyorsanız, pizza ısmarlamak aklınızdan geçmez bile.  İşte el altında bulundurulması gereken kimi seçenekler: dondurulmuş sebzeler, tam tahıl makarna, yağsız peynir, konserve domates, konserve fasulyeler, hazır ızgara tavuk göğsü, tam tahıl tortulla veya bir torba yeşil salata."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Restoranlarda Az Porsiyon Ismarlayın","Az porsiyon ısmarlamak kaloriyi azaltmanın ve porsiyonunuzu makul ölçülerde tutmanın bir yoludur. Bazı gelişmiş ülkelerde bu durum öyle yaygındır ki lokantaların porsiyonları tümden küçülmüştür. Başka bir hile de daha küçük tabaklar kullanmak. Bu porsiyonun daha büyük görünmesini sağlar, gözünüz doyunca, midenizin doyma ihtimali de artar."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Bir Tabak Makarna Yerine Bir Tabak Sebze Yemeğini Seçin","Daha az makarna ve ekmek yerine daha çok sebze tüketerek her yıl bir boy daha küçük giyinebilirsiniz. Porsiyondaki nişasta miktarını azaltıp sebze miktarını azaltmakla günde 100 ila 200 kalori kesinti yapabilirsiniz."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Her Zaman Kahvaltı Yapın","Kahvaltı yapmamak diyetinizde on puan öne geçmek gibi görünüyor değil mi? Kahvaltıyı atla, kilo ver! Fakat bazı araştırmalar tam tersinin doğru olabileceğini gösteriyor. Kahvaltı yapmayınca daha sonra daha çok acıkırsınız, öğle veya akşam yemeğinde ölçüsüz yeme güdünüz artar. Kilo kaybetmek – veya kiloları korumak için – her zaman sağlıklı bir sabah kahvaltısı yapın, yüksek lifli tahıllar, az yağlı süt ve meyve gibi."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Diyetinize Lif Katın","Lif sindirime yardım eder, kabızlığı önler ve kolesterol seviyesini düşürerek kilo kaybetmenize yardımcı olur. Birçok insan ihtiyaç duyduğu lifin sadece yarısını tüketebilmektedir. Liflerden faydalanabilmek için kadınlar günde 21-25 gram lif almalı, erkekler ise günde 30-38 gram lif almalıdır.  İyi lif kaynakları yulaf ezmesi, fasulyeler, tam tahıllı gıdalar ile bir sürü meyve ve sebzedir."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Raflardaki Kilo Aldırıcı Yiyeceklerden Kurtulun","Eğer buzdolabında dondurma, dolapta cips varsa, kilo kaybetmeyi kendiniz için zorlaştırıyorsunuz demektir. Raflardaki kilo aldırıcı yiyeceklerden kurtularak baştan çıkmalara imkan vermeyin. Arada bir şımarmak mı istiyorsunuz? Bunu yapabilmek için evden çıkıp epey bir mesafe kat etmeniz gereksin – tabii ki yürüyerek."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Yavaş Yavaş Kilo Kaybedin","Eğer istediğiniz kadar hızlı kilo vermiyorsanız, cesaretiniz kırılmasın. Kiloların azalmaya başlaması, tıpkı onları almanız gibi yavaşça olan bir şeydir. Uzmanlar haftada yarım veya bir kilo gibi gerçekçi bir kilo kaybetme planını tavsiye etmektedir. Eğer beklentileriniz çok yüksek olursa, yeterince hızlı kilo kaybetmediğiniz için vazgeçebilirsiniz. Unutmayın kilo vermenin sağlıkla ilgili faydalarını görebilmek için vücut ağırlığınızın yüzde 5 ila 10''unu kaybetmeniz gerekir."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Haftada Bir Kez Tartılın","Düzenli olarak tartılan insanlar kilo kaybetmede daha başarılı oluyorlar. Fakat birçok uzman günlük iniş çıkışlardan etkilenmemek için haftada bir kez tartılmanızı tavsiye etmektedir. Tartılırken şu ipuçlarını takip edin:   Haftanın aynı vaktinde, aynı gün, aynı saat, aynı terazi ve aynı kıyafetlerle tartılın."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Yeterince Uyuyun","Uykunuz kesintiye uğradığında, vücudunuz iştahınızı açan ghrelin hormonundan fazla, fakat tok olduğunuzu söyleyen leptin hormonundan daha az üretir. Yeterli uyku çekmek kendinizi dinlenmiş, karnı tok hissettirir ve gereksiz atıştırmalardan sizi uzak tutar."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Porsiyon Boylarını Anlayın","Dışarıda yemek yerken önümüze çok büyük porsiyonlar gelmesine alışkınız, evde de böyle düşünmek çok kolay. Porsiyonlarınızı doğru ölçmek için bir iki hafta boyunca mutfak terazilerini veya ölçü bardaklarını kullanın. Porsiyonlarınızı küçültmek için daha küçük tabaklar ve bardaklar kullanın. Restoranların porsiyonlarını ikiye bölün ve büyük bir yemekten iki porsiyon çıkarın. Hazır yiyecekleri doğrudan kabının içinden yemek yerine tabağa koyup yiyin."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Daha Fazla Meyve Ve Sebze Yemek","En iyi ''diyet'' daha az yediğiniz değil, daha çok yediğiniz diyettir. Daha fazla meyve ve sebze yerseniz, o kadar aç hissetmezsiniz, çünkü besin açısından zengin bu besinler aynı zamanda su ve lif açısından da zengindir, bu yüzden sizi daha uzun süre tok tutarlar. Atıştırmak, akıllıca yapıldığında, sizin için iyi bir şey haline dönüşebilir."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Yalnızca Haftasonları Alkol Tüketin","Alkol boş kaloriler içerir: bir bardak birada 153 kalori, bir bardak şarapta 125 kalori vardır. Vücutlarımız bu kalorileri iyi kullanamadığı için, genellikle doğrudan yağa dönüştürülürler. Arada bir içiyorsanız, bunu telafi etmenin bir yolunu bulun. Sevdiğiniz içkiyi yalnızca hafta sonları tüketin, kadınlarda günde bir kadeh, erkeklerde iki kadeh geçilmesin."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Şekersiz Sakız Çiğneyin","Atıştırmak için şişmanlatıcı bir şeye eliniz uzandığında, bunun yerine şekersiz sakız çiğneyin. Sakız çiğnemek ağzınızdaki tadı tazeler ve açlığınızı, atıştırma arzularınızı frenleyerek kilo kaybetmenize yardım eder. Her ne kadar sakız daha az yemek yemenize neden olsa da, doğru beslenmeyi de bırakmanız gerekmiyor. İyi bir beslenme ve spor yine de gereklidir."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Yiyecek Günlüğü Tutun","Basit bir kalem ve kağıt kilo kaybetme planınıza güç verebilir. Araştırmalar gösteriyor ki yediklerinizi ve içtiklerinizi not etmek, neyi, ne zaman ve nasıl tükettiniz konusunda sizi daha bilinçli kılarak eninde sonunda az kalorili seçimlere yöneltir. Bir araştırmaya göre haftada altı gün beslenme günlüğü tutan insanlar haftada bir kez veya daha az beslenme günlüğü tutanlardan iki kat daha başarılıdır."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Başarıyı Kutlayın (Ama Yiyerek Değil)","Bu ay üç kilo kaybettiniz ve iki günde bir yürüyüş yaptınız, öyle mi? Kutlama vakti! Kilo kaybetmede başarıyı kutlamak daha fazla başarıyı teşvik eder, bu yüzden başarılarınızı takdir edin. Bir CD alın, sinemaya gidin ve sonraki aşamanın ödülünü belirleyin. Pizzayla, künefeyle kutlamayın yeter."));
        diyetIpuclariModelList.add(new SwipeCardsViewModel("Dostlarınızdan Ve Ailenizden Yardım Alın","Destek almak, kilo kaybetme hedeflerinize ulaşmanızda yardımcı olabilir. Bu yüzden arkadaşlarınıza ve ailenize kilo kaybetmek istediğinizi belli edin. Belki sizi egzersiz yapmaya veya sağlıklı yemeklere davet ederler. Vazgeçecek gibi olduğunuzda, size yardım ederler, sizin sözlerinize sadık kalmanızı sağlar ve sizi neşelendirir, kısaca her şeyi daha kolaylaştırabilirler."));


        SwipeCardsViewAdapter diyetipuclariadapter=new SwipeCardsViewAdapter(diyetIpuclariModelList,MainActivity.this);
        swipeCardsView.setAdapter(diyetipuclariadapter);
    }

}
