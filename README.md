# EasyHomeJava

C#で作成した EasyHome のJava版です

電話発信機能に特化し, 最低限の機能のみを実装しています.
高齢者の方やスマートフォン操作に不慣れな方の誤操作防止として利用できます.

## 特徴

* ホームアプリとして設定することで電話専用端末として利用可能
* 登録した電話番号へ1ボタンで発信可能(最大2件まで)
* 2つの発信ボタンはテキスト, 色を個別に設定可能

## ダウンロード

アプリは[Releaseページ](https://github.com/nfmcpwr/EasyHomeJava/releases/latest)からダウンロードできます.

## 設定

設定は `/sdcard/EasyHome/Config/CallButtonConfig` にJSON形式で保存されています.  

ファイル内の各キーは以下の設定と対応しています.

| キー | 設定 | 値 |
|---|---|---|
| `Button1Text` | ボタン1(上) に表示されるテキスト | 文字列 |
| `Button1BackgroundColor` | ボタン1(上) の背景色 | [`Color.parseColor()`](https://developer.android.com/reference/android/graphics/Color#parseColor(java.lang.String)) で変換可能な色を示す文字列 <br> 例: `#AC99EA`, `#FFAC99EA`, `red` |
| `Button1TextColor` | ボタン1(上) の文字色 | [`Color.parseColor()`](https://developer.android.com/reference/android/graphics/Color#parseColor(java.lang.String)) で変換可能な色を示す文字列 <br> 例: `#000000`, `#FF000000`, `black` |
| `Button1TelNumber` | ボタン1(上) クリック時に発信する電話番号 | 数字のみ(`[0-9]`)で構成された文字列 |
| `Button2Text` | ボタン2(下) に表示されるテキスト | 文字列 |
| `Button2BackgroundColor` | ボタン2(下) の背景色 | [`Color.parseColor()`](https://developer.android.com/reference/android/graphics/Color#parseColor(java.lang.String)) で変換可能な色を示す文字列 <br> 例: `#AC99EA`, `#FFAC99EA`, `red` |
| `Button2TextColor` | ボタン2(下) の文字色 | [`Color.parseColor()`](https://developer.android.com/reference/android/graphics/Color#parseColor(java.lang.String)) で変換可能な色を示す文字列 <br> 例: `#000000`, `#FF000000`, `black` |
| `Button2TelNumber` | ボタン2(下) クリック時に発信する電話番号 | 数字のみ(`[0-9]`)で構成された文字列 |

## ライセンス

このプロジェクトはMIT Licenseのもとで公開されています.

詳細は [`LICENSE`](https://github.com/nfmcpwr/EasyHomeJava/blob/master/LICENSE) を参照してください.
