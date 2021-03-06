<?php

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>ご当地検索エンジン</title>
  <link href="./bootstrap-5.0.0-beta1-dist/css/bootstrap.min.css" rel="stylesheet"/>
<!--  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous"> -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Google Youtbe -->
  <script src="https://www.gstatic.com/external_hosted/jquery2.min.js"></script>
  <script src="https://apis.google.com/js/api.js"></script>

  <!-- My JavaScript -->
  <script src="./auth.js"></script>
  <script src="./Gotochi.js"></script>

  <style>
    p#targetTodohu {
      padding-bottom: 5px;
      background-color: #c39143;
      font-style: oblique 10deg;
      font-size: x-large;
      line-height: 2em;
       border-bottom: double 5px #FFC778;
    }
  </style>
</head>
<body onload="selectLv1()">
<div class="container">
  <div class="row">
    <div class="col-2">
      <!-- 都道府県一覧 -->
      <select id="todohukenList">
        <option data-todohu="hokkaido" value="https://www.pref.hokkaido.lg.jp/">北海道</option>
        <option data-todohu="aomori" value="https://www.pref.aomori.lg.jp/">青森県</option>
        <option data-todohu="iwate" value="https://www.pref.iwate.jp/">岩手県</option>
        <option data-todohu="miyagi" value="https://www.pref.miyagi.jp/">宮城県</option>
        <option data-todohu="akita" value="https://www.pref.akita.lg.jp/">秋田県</option>
        <option data-todohu="yamagata" value="https://www.pref.yamagata.jp/">山形県</option>
        <option data-todohu="fukushima" value="https://www.pref.fukushima.lg.jp/">福島県</option>
        <option data-todohu="ibaraki" value="https://www.pref.ibaraki.jp/">茨城県</option>
        <option data-todohu="tochigi" value="https://www.pref.tochigi.lg.jp/">栃木県</option>
        <option data-todohu="gunma" value="https://www.pref.gunma.jp/">群馬県</option>
        <option data-todohu="saitama" value="https://www.pref.saitama.lg.jp/">埼玉県</option>
        <option data-todohu="chiba" value="https://www.pref.chiba.lg.jp/">千葉県</option>
        <option data-todohu="tokyo" value="https://www.metro.tokyo.lg.jp/">東京都</option>
        <option data-todohu="kanagawa" value="https://www.pref.kanagawa.jp/">神奈川県</option>
        <option data-todohu="niigata" value="https://www.pref.niigata.lg.jp/">新潟県</option>
        <option data-todohu="toyama" value="https://www.pref.toyama.jp/">富山県</option>
        <option data-todohu="ishikawa" value="https://www.pref.ishikawa.lg.jp/">石川県</option>
        <option data-todohu="fukui" value="https://www.pref.fukui.lg.jp/">福井県</option>
        <option data-todohu="yanashi" value="https://www.pref.yamanashi.jp/">山梨県</option>
        <option data-todohu="nagano" value="https://www.pref.nagano.lg.jp/">長野県</option>
        <option data-todohu="gifu" value="https://www.pref.gifu.lg.jp/">岐阜県</option>
        <option data-todohu="shizuoka" value="https://www.pref.shizuoka.jp/">静岡県</option>
        <option data-todohu="aichi" value="https://www.pref.aichi.jp/">愛知県</option>
        <option data-todohu="mie" value="https://www.pref.mie.lg.jp/">三重県</option>
        <option data-todohu="shiga" value="https://www.pref.shiga.lg.jp/">滋賀県</option>
        <option data-todohu="kyoto" value="https://www.pref.kyoto.jp/">京都府</option>
        <option data-todohu="osaka" value="https://www.pref.osaka.lg.jp/">大阪府</option>
        <option data-todohu="hyogo" value="https://web.pref.hyogo.lg.jp/">兵庫県</option>
        <option data-todohu="nara" value="https://www.pref.nara.jp/">奈良県</option>
        <option data-todohu="wakayama" value="https://www.pref.wakayama.lg.jp/">和歌山県</option>
        <option data-todohu="tottori" value="https://www.pref.tottori.lg.jp/">鳥取県</option>
        <option data-todohu="shimane" value="https://www.pref.shimane.lg.jp/">島根県</option>
        <option data-todohu="okayama" value="https://www.pref.okayama.jp/">岡山県</option>
        <option data-todohu="hiroshima" value="https://www.pref.hiroshima.lg.jp/">広島県</option>
        <option data-todohu="yamaguchi" value="https://www.pref.yamaguchi.lg.jp/">山口県</option>
        <option data-todohu="tokushima" value="https://www.pref.tokushima.lg.jp/">徳島県</option>
        <option data-todohu="kagawa" value="https://www.pref.kagawa.lg.jp/">香川県</option>
        <option data-todohu="ehime" value="https://www.pref.ehime.jp/">愛媛県</option>
        <option data-todohu="kochi" value="https://www.pref.kochi.lg.jp/">高知県</option>
        <option data-todohu="fukuoka" value="https://www.pref.fukuoka.lg.jp/">福岡県</option>
        <option data-todohu="saga" value="https://www.pref.saga.lg.jp/">佐賀県</option>
        <option data-todohu="nagasaki" value="https://www.pref.nagasaki.jp/">長崎県</option>
        <option data-todohu="kumamoto" value="https://www.pref.kumamoto.jp/">熊本県</option>
        <option data-todohu="oita" value="https://www.pref.oita.jp/">大分県</option>
        <option data-todohu="miyazaki" value="https://www.pref.miyazaki.lg.jp/">宮崎県</option>
        <option data-todohu="kagoshima" value="https://www.pref.kagoshima.jp/">鹿児島県</option>
        <option data-todohu="okinawa" value="https://www.pref.okinawa.lg.jp/">沖縄県</option>
      </select>
    </div>
    <div class="col-8 text-center">
      <p id="targetTodohu">北海道</p>
    </div>
    <div class="col-2">
      <select id="shityoson">
        <option value="">市町村</option>
      </select>
    </div>
  </div>
  <div class="row">
    <div class="col-2">
      1 of 3
    </div>
    <div class="col-8">
      <input id="query" value='cats' type="text"/>
      <button onclick="search()">Search</button>
      <pre id="response"></pre>
    </div>
    <div class="col-2">
      3 of 3
    </div>
  </div>
  <div class="row">
    <div class="col">
      1 of 3
    </div>
    <div class="col">
      2 of 3
    </div>
    <div class="col">
      3 of 3
    </div>
  </div>
</div>
  <footer>
    Fotters
  </footer>
</body>
</html>
