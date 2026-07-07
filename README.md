# EasyHomeJava

C#で作成した EasyHome のJava版(軽量化版)です

EasyHomeよりさらに電話発信機能に特化し, 最低限の機能のみを実装しています.
高齢者の方やスマートフォン操作に不慣れな方の誤操作防止として利用できます.

## 特徴

* ホームアプリとして設定することで電話専用端末として利用可能
* 登録した電話番号へ1ボタンで発信可能(最大2件まで)
* 2つの発信ボタンはテキスト, 色を個別に設定可能

## ダウンロード

アプリは[Releaseページ](https://github.com/nfmcpwr/EasyHomeJava/releases/latest)からダウンロードできます.

## 設定

> [!IMPORTANT]
> **誤操作防止のためアプリ内からの設定はできません**


設定は `/sdcard/EasyHome/Config/CallButtonConfig` にJSON形式で保存されています.  

ファイル内の各キーは以下の設定と対応しています.

| キー | 設定 | デフォルト値 |
|---|---|---|
| `Button1Text` | ボタン1(上) に表示されるテキスト | `button1` |
| `Button1BackgroundColor` | ボタン1(上) の背景色 | `#AC99EA` |
| `Button1TelNumber` | ボタン1(上) クリック時に発信する電話番号 | `(空文字列)` |
| `Button2Text` | ボタン2(下) に表示されるテキスト | `button2` |
| `Button2BackgroundColor` | ボタン2(下) の背景色 | `#AC99EA` |
| `Button2TelNumber` | ボタン2(下) クリック時に発信する電話番号 | `(空文字列)` |

## ライセンス

このプロジェクトはMIT Licenseのもとで公開されています.

詳細は [`LICENSE`](https://github.com/nfmcpwr/EasyHomeJava/blob/master/LICENSE) を参照してください.
