# Katalon Petstore Web Automation

## Project

Automation testing website [JPetStore](https://petstore.octoperf.com/actions/Catalog.action)
menggunakan Katalon Studio dengan Hybrid Mode (Object Repository manual + script Groovy, tanpa Record Web).

## Fitur

- Positive & negative testing
- Data-Driven Testing (`TD_InvalidLogin`, `TD_SearchKeyword`)
- Global Variable untuk credential (`BASE_URL`, `USERNAME`, `PASSWORD`)
- Test Suite + execution report

## Cara Menjalankan

1. Install Katalon Studio dan Google Chrome.
2. Clone repo: `git clone https://github.com/yayanhakiki/katalon-petstore-web.git`
3. Buka folder project lewat Katalon Studio (File > Open Project).
4. Cek **Profiles > default**, isi username `yayanh` dan password `yayanh`.
5. Buka `Test Suites/TS_Petstore_Regression`, lalu klik **Run > Chrome**.
6. Report ada di folder `Reports/` dan contoh hasil export di `Reports-Export/`.

## Test Suite

`TS_Petstore_Regression` menjalankan TC01 sampai TC06.

## Test Coverage

| ID   | Skenario                                    | Tipe                | DDT |
| ---- | ------------------------------------------- | ------------------- | --- |
| TC01 | Login dengan credential valid               | Positive            | -   |
| TC02 | Login dengan data salah (login harus gagal) | Negative            | Ya  |
| TC03 | Pencarian produk (ada dan tidak ada hasil)  | Positive & Negative | Ya  |
| TC04 | Browse kategori sampai detail item          | Positive            | -   |
| TC05 | Tambah item ke cart setelah login           | Positive            | -   |
| TC06 | Checkout tanpa login diarahkan ke Sign In   | Negative            | -   |

## Struktur

- `Test Cases/` script TC01-TC06 dan TC_Common_Login
- `Data Files/` test data untuk DDT
- `Object Repository/` test object
- `Test Suites/` TS_Petstore_Regression
- `Profiles/` Global Variable
- `Reports-Export/` hasil eksekusi
