# 🎲 Zar Oyunu - Java Konsol Oyunu

Bu proje, **Java diliyle geliştirilmiş basit bir Zar Oyunu**dur. Oyunda **kullanıcı bilgisayara karşı yarışır**. İlk olarak **100 puana ulaşan** kazanır.

## 📌 Oyun Kuralları

- Her oyuncu bir **çift zar** atar.
- Eğer **bir tane 1** gelirse, o turda **puan kazanılmaz** ve sıra diğer oyuncuya geçer.
- Eğer **iki tane 1** gelirse, oyuncunun **tüm puanları sıfırlanır**.
- Oyuncu isterse zar atmaya devam edebilir ya da turunu sonlandırıp mevcut tur puanını alabilir.
- **Bilgisayar**, bir turda 20 puana ulaşana kadar zar atar ya da 1 geldiğinde durur.

## 📁 Dosyalar

- `DiceGame.java`: Oyunun ana sınıfı, kullanıcı etkileşimi ve oyun mantığı burada yer alır.
- `Die.java`: Tek bir zarın yapısını ve davranışlarını tanımlar.
- `PairOfDice.java`: İki zar birlikte kullanılarak toplam değer hesaplanır.
- `RollingDice.java`: Üç zar atılarak test işlemi yapılır, toplam değer gösterilir.

## ▶️ Nasıl Oynanır?

1. `DiceGame.java` dosyasını çalıştır.
2. Ekrandaki yönergeleri takip et:
   - Zar atmak için `ENTER` tuşuna bas.
   - Turunu sonlandırmak istersen herhangi bir harfe bas.
3. **Oyunculardan biri 100 puana ulaştığında oyun biter**