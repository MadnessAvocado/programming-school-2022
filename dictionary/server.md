# Инструкция по настройке соединения с сервером

## Генерация ssh ключа
Пишем `ssh-keygen`, после спамим `Enter`, все дефолтные значения норм, менять их не нужно.

## Копирование ключа на сервер
В следующей команде заменяем `<user>` и `<hostname>` на данные, которые вы получили
```powershell
Get-Content $env:USERPROFILE\.ssh\id_rsa.pub | ssh <user>@<hostname> "cat >> .ssh/authorized_keys"
````
После выполнения команды терминал запросит пароль, обратите внимание на то, что введённые символы не будут отображаться вообще, поэтому наилучший способ -
сделать `Ctrl+C` и `Ctrl+V`, после чего нажать `Enter`.

## Создание профиля в терминале 
В терминале нажимаем `Ctrl + ,`. После этого откроется вкладка с настройками, листаем до конца список слева, там находится кнопка
`Add new profile`. В открывшемя меню выбираем `Create empty profile` и изменяем имя профиля на `programming-school`,
а команду `%SystemRoot%\System32\cmd.exe` на `ssh <user>@<hostname>`, где `<user>` и `<hostname>` - данные, которые вы получили. Сохраняемся. 

## Установка созданного профиля по умолчанию
В верхней части списка слева выбираем вкладку `Startup`, и меняем `Default profile` на `programming-school`.

Поздравляю вас с настройкой подключения к серву)


# Server settings

## Update
```bash
sudo apt-get update && sudo apt-get upgrade
```

## Installing deps
```bash
sudo apt-get install -y openjdk-11-jdk build-essential tmux python3-pip sanpd
sudo snap install core -y
sudo snap install nvim -y
curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash
source ~/.bashrc
nvm install 16.16.0 && nvm use default
```

## Download configs
```bash
mkdir ~/.config && cd ~/.config
git clone https://github.com/usrsem/nvim-template
git clone https://github.com/usrsem/tmux
mv nvim-template nvim
```

## Setting up nvim
### Install VimPlug
```bash
sh -c 'curl -fLo "${XDG_DATA_HOME:-$HOME/.local/share}"/nvim/site/autoload/plug.vim --create-dirs https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim'
pip install neovim
```
 
### Install plugins
```bash
nvim
:PlugInstall
```

### Update plugins
```bash
nvim
:UpdateRemotePlugins
```

## Setting up tmux
### Setting config
```bash
cd ~/.config/tmux
cat README.md > ~/.tmux.conf
```
### Installing plugin manager
```bash
git clone https://github.com/tmux-plugins/tpm ~/.tmux/plugins/tpm
```
### Setup shell in top of `~/.config/tmux/.tmux.conf`. Default is fish

## User creation
```bash
sudo useradd -m -c bash <username>
sudo passwd <username>
```
