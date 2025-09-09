# Post-Test-PBO-1
# Manajemen Space Coworker
Program ini merupakan aplikasi sederhana yang digunakan untuk mengelola data ruangan untuk pekerja. Coworker space dimaknai sebagai ruang kerja bersama yang tersedia di dalam suatu perusahaan, tanpa menjelaskan lebih lanjut mengenai perusahaannya.

Program ini membantu admin dalam melakukan pengelolaan data ruangan coworker space agar lebih teratur dan mudah dipantau.

<img width="295" height="52" alt="image" src="https://github.com/user-attachments/assets/60ad76fb-f3fb-4b1e-8307-0d01a2b66e10" />

Mengimpor library untuk membuat list dinamis dan membaca input dari user.

<img width="446" height="40" alt="image" src="https://github.com/user-attachments/assets/2ece2f5b-d98c-4a42-a3de-0c2f2291560c" />

Membuat kelas utama dengan method main() sebagai titik masuk program.
<img width="571" height="64" alt="image" src="https://github.com/user-attachments/assets/83285f7a-11f9-4370-8826-e7503396bb76" />

Mendeklarasikan list untuk menyimpan data, objek scanner untuk input, dan variabel opsi untuk menu.

<img width="314" height="127" alt="image" src="https://github.com/user-attachments/assets/12c2435a-6eaa-406c-80ca-1bda97bcd615" />

Mengisi daftar space coworker dengan data awal c104, c302, c303, c304, c305.

<img width="687" height="226" alt="image" src="https://github.com/user-attachments/assets/a394c507-e023-4878-aa40-3bd894390d84" />

do-while memastikan menu selalu tampil minimal sekali dan user memilih menu dari 1–5.

Output:
![WhatsApp Image 2025-09-10 at 05 33 08_c9c294b8](https://github.com/user-attachments/assets/9f10c65b-669f-4216-a64b-1cfe75dd9562)


<img width="678" height="151" alt="image" src="https://github.com/user-attachments/assets/12aac45f-fd5a-438f-b066-d6d2271abb78" />

switch (opsi) digunakan untuk memeriksa nilai pilihan menu (opsi) dari input user, lalu menjalankan blok kode sesuai menu yang dipilih. Lalu case 1 jika user memilih menu 1, program meminta input space coworker baru dan menambahkannya ke spacecoworkerList.

Output:
![WhatsApp Image 2025-09-10 at 05 34 13_84a7570f](https://github.com/user-attachments/assets/16b7972b-a977-4b0d-8825-6569d8642a93)


<img width="674" height="222" alt="image" src="https://github.com/user-attachments/assets/6cdd4808-21e5-498e-a90e-ea13638ead04" />

Jika user memilih menu 2, program menampilkan daftar space coworker, jika list kosong maka ditampilkan pesan bahwa tidak ada data.

Output:
![WhatsApp Image 2025-09-10 at 05 34 00_8ff7c2a4](https://github.com/user-attachments/assets/3f42a7c6-e3d1-49f4-ade5-6beab047fce7)


<img width="754" height="471" alt="image" src="https://github.com/user-attachments/assets/cc92536f-dc84-45c6-8a85-8e0ef906bf91" />

Jika user memilih menu 3, program menampilkan daftar coworker, meminta nomor data yang ingin diubah, lalu mengganti data lama dengan input baru jika nomor valid.

Output:
![WhatsApp Image 2025-09-10 at 05 35 07_c1ef2e72](https://github.com/user-attachments/assets/b8ffa443-2737-405c-b052-d0f36978d580)


<img width="771" height="432" alt="image" src="https://github.com/user-attachments/assets/d08b216f-9512-4c79-9a34-1ca0f9dd48e0" />

Jika user memilih menu 4, program menampilkan daftar space coworker, meminta nomor data yang ingin dihapus, lalu menghapus data tersebut dari list jika nomor valid.

Output:
![WhatsApp Image 2025-09-10 at 05 35 26_4ce7ef29](https://github.com/user-attachments/assets/b6dd4895-4913-4c5c-8e72-bed514063ab5)


<img width="480" height="50" alt="image" src="https://github.com/user-attachments/assets/6bdac066-4338-496a-beef-227e69c3a83e" />

Jika user memasukkan angka selain 1–5, program akan menampilkan pesan “Pilihan tidak valid.”

Output:
![WhatsApp Image 2025-09-10 at 05 39 33_d5a7ef59](https://github.com/user-attachments/assets/92c7d825-20a2-4eab-a92d-ed926e1883e5)


<img width="299" height="111" alt="image" src="https://github.com/user-attachments/assets/dcb07f73-7e27-46f5-9224-02ec92d6f77b" />

Perulangan berhenti kalau user pilih opsi 5 (Keluar), dan scanner.close(); befungsi menutup scanner agar tidak ada kebocoran resource.

Output:
![WhatsApp Image 2025-09-10 at 05 35 42_b783a801](https://github.com/user-attachments/assets/9d1994b9-28dc-4094-b4b4-25ca07afcd79)
