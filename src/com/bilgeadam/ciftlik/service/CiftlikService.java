package com.bilgeadam.ciftlik.service;

import com.bilgeadam.ciftlik.entity.bitkiler.agaclar.Armut;
import com.bilgeadam.ciftlik.entity.bitkiler.agaclar.Elma;
import com.bilgeadam.ciftlik.entity.bitkiler.tarim.Biber;
import com.bilgeadam.ciftlik.entity.bitkiler.tarim.Salatalik;
import com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar.At;
import com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar.Inek;
import com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar.Keci;
import com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar.Koyun;
import com.bilgeadam.ciftlik.entity.hayvanlar.kumes.Hindi;
import com.bilgeadam.ciftlik.entity.hayvanlar.kumes.Tavuk;

public class CiftlikService {
    public static void main(String[] args) {

        Elma elma1 = new Elma(12,50,550,280.0,120,1800,1350,320);
        Armut armut1 = new Armut(18,40,1550,1280.0,1120,11800,11350,1320);

        Salatalik salatalik1 = new Salatalik(12,50,550,280.0,120,1800,1350,320);
        Biber biber1 = new Biber(12,50,550,280.0,120,1800,1350,320);

        Inek inek1 = new Inek(19850,50,8950,12250);
        At at1 = new At(419850,5,28950,82250);

        Keci keci1 = new Keci(230000,150,1250);
        Koyun koyun1 = new Koyun(319850,240,980);

        Hindi hindi1 = new Hindi(14850,50,22250);
        Tavuk tavuk1 = new Tavuk(75850,250,62250);

        inek1.besle();

        /**
         * daha önce gönderilmediyse
         * 1 - git init
         * 2 - git add . //projedeki bütün değişiklikleri gite ekler
         * 3 - git commit -m "mesaj yazılacak"
         * 4 - git remote add origin(herhangi bir değişken yazılabilir)
         *     repoURL.git --> https://github.com/name/reponame.git //uzak sunucuya gönderiyoruz nereye göndereceğimizi söylüyoruz
         * 5 - git branch //hangi branchde(dalda) olduğumuzu gösterir
         * 6 - git push -u(opsiyonel) origin(4. adımda belirlediğimiz değişken) master/main(branch adımız neyse onu yazıyoruz)
         * 7-  git push --force origin(4. adımda belirlediğimiz değişken) master/main(branch adımız neyse onu yazıyoruz) //alternatif push hata döndürmüyor ama pushlamıyorsa
         *
         * daha önce gönderildiyse 1. adımı(**git init**) yazmaya gerek yok */

    }
}
